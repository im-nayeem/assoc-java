-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 10, 2023 at 05:54 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `assoc`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `email` varchar(30) NOT NULL,
  `salt` varchar(2000) DEFAULT NULL,
  `pass` varchar(1000) DEFAULT NULL,
  `role` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`email`, `salt`, `pass`, `role`) VALUES
('admin@assoc.com', 'y4lfHUcEuDlLAw8peTM8cWgW24LnrkD3GLQjN8Czy8rKjlwQqnMWEPVi+qPzf4qSme7Wpn5gNK6hZfgzLmnHgO/u8M92C2O+cD7OAv450Aiotw7N+G+CJ9XqYCOhpeR2VZj7A+q/Pw+59TPY3T9gsvP+QFHlT/Or7sJWF/f5XoUj7ses6QQBARVCXmW6//7kUHJAODeW2mYdHKIryNe3B/rVdg3R34xnK3V3IPuQMBVmXuwlFslgDeYuwNsN0CVXdvwTuXi6qoYPdefUNA/+njjccxKtDTH9LOs0P0J9+X5Y5YeRxb8pJCcgmSiO0ltKHiHISg5Lb1W1yfnn5DQ3M8+NLIXBH6n16v6RcgERTLdeTCM2GAj3cxoOjMyUSv4KqkUIA3q5isTURjFnHqrwqJgbBMSft6G4b+zOrZ/CKS1BVmByz54P3MpVa+S9oqm+oWUN/4Vl3MJe2K6kYGnm8fz9JGcX3XdbfkcA5YCLhy2TtBeYXcTIHgPZaJ3obdhbegQ1m/9nTRzUNrh7CASzD9MN5qy+Jj/D2GQcDcewxULhjm/bw9qeR0FUk+cquPSfVZsSLj7ZfF+USd1YGvU0glYqBHx1QCjfU6FGKHz/qWylQ8HdJY8Nvr95s+UZ07XovoGZlbZKZ0A26mogCrGsQnfOvcWBv9FMT8DbiLDf+js=', 'HTdZpEYn7vHg50KfyLaXgaRI5HAkB9Gh1gdn4tZ4hgUoq0rhTJ8GRCzei0Cj8TSfdoThjpmBdj+kxdV+c6yBaA==', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `adviser`
--

CREATE TABLE `adviser` (
  `name` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `present_addr` varchar(70) DEFAULT NULL,
  `permanent_addr` varchar(70) DEFAULT NULL,
  `photo` mediumblob DEFAULT NULL,
  `occupation` varchar(50) DEFAULT NULL,
  `from_time` date DEFAULT NULL,
  `to_time` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `alumni`
--

CREATE TABLE `alumni` (
  `id` int(11) NOT NULL,
  `email` varchar(30) NOT NULL,
  `occupation` varchar(30) DEFAULT NULL,
  `job_loc` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `assoc_info`
--

CREATE TABLE `assoc_info` (
  `assoc_name` varchar(100) DEFAULT NULL,
  `assoc_abbr` varchar(10) DEFAULT NULL,
  `assoc_logo` mediumblob DEFAULT NULL,
  `about` varchar(2000) DEFAULT NULL,
  `constitution` mediumblob DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `pass` varchar(20) DEFAULT NULL,
  `pay_details` varchar(100) DEFAULT NULL,
  `prsdnt_phone` varchar(15) DEFAULT NULL,
  `Gs_phone` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `culture`
--

CREATE TABLE `culture` (
  `culture_id` int(11) NOT NULL,
  `media_id` int(11) NOT NULL,
  `headline` varchar(1000) DEFAULT NULL,
  `details` varchar(3000) DEFAULT NULL,
  `label` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `exec_committee`
--

CREATE TABLE `exec_committee` (
  `committee_id` int(11) NOT NULL,
  `from_time` date DEFAULT NULL,
  `to_time` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `exec_member`
--

CREATE TABLE `exec_member` (
  `id` int(11) NOT NULL,
  `email` varchar(30) NOT NULL,
  `post` varchar(40) DEFAULT NULL,
  `committee_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `gallery`
--

CREATE TABLE `gallery` (
  `id` int(11) NOT NULL,
  `short_desc` varchar(1000) DEFAULT NULL,
  `highlights` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `media`
--

CREATE TABLE `media` (
  `media_id` int(11) NOT NULL,
  `photo1` mediumblob DEFAULT NULL,
  `caption1` varchar(1000) DEFAULT NULL,
  `photo2` mediumblob DEFAULT NULL,
  `caption2` varchar(1000) DEFAULT NULL,
  `photo3` mediumblob DEFAULT NULL,
  `caption3` varchar(1000) DEFAULT NULL,
  `video_link` varchar(1000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `members`
--

CREATE TABLE `members` (
  `name` varchar(30) DEFAULT NULL,
  `id` int(11) NOT NULL,
  `email` varchar(30) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `dept` varchar(40) DEFAULT NULL,
  `session` varchar(9) DEFAULT NULL,
  `batch` varchar(7) DEFAULT NULL,
  `gender` varchar(6) DEFAULT NULL,
  `bg` varchar(3) DEFAULT NULL,
  `photo` mediumblob DEFAULT NULL,
  `co_activity` varchar(40) DEFAULT NULL,
  `fathersname` varchar(30) DEFAULT NULL,
  `mothersname` varchar(30) DEFAULT NULL,
  `present_area` varchar(30) DEFAULT NULL,
  `present_details` varchar(50) DEFAULT NULL,
  `permanent_upazila` varchar(30) DEFAULT NULL,
  `permanent_details` varchar(50) DEFAULT NULL,
  `tranc_no` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `news`
--

CREATE TABLE `news` (
  `news_id` int(11) NOT NULL,
  `media_id` int(11) NOT NULL,
  `headline` varchar(1000) DEFAULT NULL,
  `details` varchar(3000) DEFAULT NULL,
  `footer` varchar(500) DEFAULT NULL,
  `post_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `notice`
--

CREATE TABLE `notice` (
  `notice_id` int(11) NOT NULL,
  `headline` varchar(1000) DEFAULT NULL,
  `details` varchar(3000) DEFAULT NULL,
  `footer` varchar(500) DEFAULT NULL,
  `post_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `varsity_info`
--

CREATE TABLE `varsity_info` (
  `varsity_name` varchar(50) DEFAULT NULL,
  `website_link` varchar(30) DEFAULT NULL,
  `dept` varchar(3000) DEFAULT NULL,
  `last_batch` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `verified`
--

CREATE TABLE `verified` (
  `email` varchar(30) DEFAULT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`email`);

--
-- Indexes for table `adviser`
--
ALTER TABLE `adviser`
  ADD KEY `email` (`email`);

--
-- Indexes for table `alumni`
--
ALTER TABLE `alumni`
  ADD KEY `id` (`id`),
  ADD KEY `email` (`email`);

--
-- Indexes for table `culture`
--
ALTER TABLE `culture`
  ADD PRIMARY KEY (`culture_id`),
  ADD UNIQUE KEY `culture_id` (`culture_id`),
  ADD UNIQUE KEY `media_id` (`media_id`);

--
-- Indexes for table `exec_committee`
--
ALTER TABLE `exec_committee`
  ADD PRIMARY KEY (`committee_id`);

--
-- Indexes for table `exec_member`
--
ALTER TABLE `exec_member`
  ADD KEY `committee_id` (`committee_id`),
  ADD KEY `id` (`id`),
  ADD KEY `email` (`email`);

--
-- Indexes for table `gallery`
--
ALTER TABLE `gallery`
  ADD UNIQUE KEY `id` (`id`);

--
-- Indexes for table `media`
--
ALTER TABLE `media`
  ADD PRIMARY KEY (`media_id`),
  ADD UNIQUE KEY `media_id` (`media_id`);

--
-- Indexes for table `members`
--
ALTER TABLE `members`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`),
  ADD KEY `email` (`email`);

--
-- Indexes for table `news`
--
ALTER TABLE `news`
  ADD PRIMARY KEY (`news_id`),
  ADD UNIQUE KEY `news_id` (`news_id`),
  ADD UNIQUE KEY `media_id` (`media_id`);

--
-- Indexes for table `notice`
--
ALTER TABLE `notice`
  ADD PRIMARY KEY (`notice_id`),
  ADD UNIQUE KEY `notice_id` (`notice_id`);

--
-- Indexes for table `verified`
--
ALTER TABLE `verified`
  ADD KEY `email` (`email`),
  ADD KEY `id` (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `culture`
--
ALTER TABLE `culture`
  MODIFY `culture_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `media`
--
ALTER TABLE `media`
  MODIFY `media_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `news`
--
ALTER TABLE `news`
  MODIFY `news_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `notice`
--
ALTER TABLE `notice`
  MODIFY `notice_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `adviser`
--
ALTER TABLE `adviser`
  ADD CONSTRAINT `adviser_ibfk_1` FOREIGN KEY (`email`) REFERENCES `account` (`email`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `alumni`
--
ALTER TABLE `alumni`
  ADD CONSTRAINT `alumni_ibfk_1` FOREIGN KEY (`id`) REFERENCES `members` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `alumni_ibfk_2` FOREIGN KEY (`email`) REFERENCES `members` (`email`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `culture`
--
ALTER TABLE `culture`
  ADD CONSTRAINT `culture_ibfk_1` FOREIGN KEY (`media_id`) REFERENCES `media` (`media_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `exec_member`
--
ALTER TABLE `exec_member`
  ADD CONSTRAINT `exec_member_ibfk_1` FOREIGN KEY (`committee_id`) REFERENCES `exec_committee` (`committee_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `exec_member_ibfk_2` FOREIGN KEY (`id`) REFERENCES `members` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `exec_member_ibfk_3` FOREIGN KEY (`email`) REFERENCES `members` (`email`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `gallery`
--
ALTER TABLE `gallery`
  ADD CONSTRAINT `gallery_ibfk_1` FOREIGN KEY (`id`) REFERENCES `media` (`media_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `members`
--
ALTER TABLE `members`
  ADD CONSTRAINT `members_ibfk_1` FOREIGN KEY (`email`) REFERENCES `account` (`email`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `news`
--
ALTER TABLE `news`
  ADD CONSTRAINT `news_ibfk_1` FOREIGN KEY (`media_id`) REFERENCES `media` (`media_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `verified`
--
ALTER TABLE `verified`
  ADD CONSTRAINT `verified_ibfk_1` FOREIGN KEY (`email`) REFERENCES `members` (`email`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `verified_ibfk_2` FOREIGN KEY (`id`) REFERENCES `members` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
